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
import com.ruoyi.system.domain.DormitoryRepairfor;
import com.ruoyi.system.service.IDormitoryRepairforService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍维修管理Controller
 * 
 * @author 朱鸿斌
 * @date 2022-02-15
 */
@RestController
@RequestMapping("/system/repairfor")
public class DormitoryRepairforController extends BaseController
{
    @Autowired
    private IDormitoryRepairforService dormitoryRepairforService;

    /**
     * 查询宿舍维修管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:repairfor:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryRepairfor dormitoryRepairfor)
    {
        startPage();
        List<DormitoryRepairfor> list = dormitoryRepairforService.selectDormitoryRepairforList(dormitoryRepairfor);
        return getDataTable(list);
    }

    /**
     * 导出宿舍维修管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:repairfor:export')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryRepairfor dormitoryRepairfor)
    {
        List<DormitoryRepairfor> list = dormitoryRepairforService.selectDormitoryRepairforList(dormitoryRepairfor);
        ExcelUtil<DormitoryRepairfor> util = new ExcelUtil<DormitoryRepairfor>(DormitoryRepairfor.class);
        util.exportExcel(response, list, "宿舍维修管理数据");
    }

    /**
     * 获取宿舍维修管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:repairfor:query')")
    @GetMapping(value = "/{repairFid}")
    public AjaxResult getInfo(@PathVariable("repairFid") Long repairFid)
    {
        return AjaxResult.success(dormitoryRepairforService.selectDormitoryRepairforByRepairFid(repairFid));
    }

//    /**
//     * 新增宿舍维修管理
//     */
//    @PreAuthorize("@ss.hasPermi('system:repairfor:add')")
//    @Log(title = "宿舍维修管理", businessType = BusinessType.INSERT)
//    @PostMapping
//    public AjaxResult add(@RequestBody DormitoryRepairfor dormitoryRepairfor)
//    {
//        return toAjax(dormitoryRepairforService.insertDormitoryRepairfor(dormitoryRepairfor));
//    }

    /**
     * 修改宿舍维修管理
     */
    @PreAuthorize("@ss.hasPermi('system:repairfor:edit')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryRepairfor dormitoryRepairfor)
    {
        return toAjax(dormitoryRepairforService.updateDormitoryRepairfor(dormitoryRepairfor));
    }

    /**
     * 删除宿舍维修管理
     */
    @PreAuthorize("@ss.hasPermi('system:repairfor:remove')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{repairFids}")
    public AjaxResult remove(@PathVariable Long[] repairFids)
    {
        return toAjax(dormitoryRepairforService.deleteDormitoryRepairforByRepairFids(repairFids));
    }
}
