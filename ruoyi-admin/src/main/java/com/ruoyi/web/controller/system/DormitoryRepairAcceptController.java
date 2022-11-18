package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.DormitoryRepairAccept;
import com.ruoyi.system.service.IDormitoryRepairAcceptService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务指派Controller
 * 
 * @author 朱鸿斌
 * @date 2022-04-27
 */
@RestController
@RequestMapping("/system/accept")
public class DormitoryRepairAcceptController extends BaseController
{
    @Autowired
    private IDormitoryRepairAcceptService dormitoryRepairAcceptService;



    /**
     * 查询任务指派列表
     */
    @PreAuthorize("@ss.hasPermi('system:accept:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryRepairAccept dormitoryRepairAccept)
    {
        startPage();
        List<DormitoryRepairAccept> list = dormitoryRepairAcceptService.selectDormitoryRepairAcceptList(dormitoryRepairAccept);
        return getDataTable(list);
    }

    /**
     * 导出任务指派列表
     */
    @PreAuthorize("@ss.hasPermi('system:accept:export')")
    @Log(title = "任务指派", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryRepairAccept dormitoryRepairAccept)
    {
        List<DormitoryRepairAccept> list = dormitoryRepairAcceptService.selectDormitoryRepairAcceptList(dormitoryRepairAccept);
        ExcelUtil<DormitoryRepairAccept> util = new ExcelUtil<DormitoryRepairAccept>(DormitoryRepairAccept.class);
        util.exportExcel(response, list, "任务指派数据");
    }

    /**
     * 获取任务指派详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:accept:query')")
    @GetMapping(value = "/{acceptRepairId}")
    public AjaxResult getInfo(@PathVariable("acceptRepairId") Long acceptRepairId)
    {
        return AjaxResult.success(dormitoryRepairAcceptService.selectDormitoryRepairAcceptByAcceptRepairId(acceptRepairId));
    }

//    /**
//     * 新增任务指派
//     */
//    @PreAuthorize("@ss.hasPermi('system:accept:add')")
//    @Log(title = "任务指派", businessType = BusinessType.INSERT)
//    @PostMapping
//    public AjaxResult add(@RequestBody DormitoryRepairAccept dormitoryRepairAccept)
//    {
//        return toAjax(dormitoryRepairAcceptService.insertDormitoryRepairAccept(dormitoryRepairAccept));
//    }

    /**
     * 修改任务指派
     */
    @PreAuthorize("@ss.hasPermi('system:accept:edit')")
    @Log(title = "任务指派", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryRepairAccept dormitoryRepairAccept)
    {
        return toAjax(dormitoryRepairAcceptService.updateDormitoryRepairAccept(dormitoryRepairAccept));
    }

    /**
     * 删除任务指派
     */
    @PreAuthorize("@ss.hasPermi('system:accept:remove')")
    @Log(title = "任务指派", businessType = BusinessType.DELETE)
	@DeleteMapping("/{acceptRepairIds}")
    public AjaxResult remove(@PathVariable Long[] acceptRepairIds)
    {
        return toAjax(dormitoryRepairAcceptService.deleteDormitoryRepairAcceptByAcceptRepairIds(acceptRepairIds));
    }
}
