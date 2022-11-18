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
import com.ruoyi.system.domain.DormitoryRepair;
import com.ruoyi.system.service.IDormitoryRepairService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍维修管理Controller
 * 
 * @author zhb
 * @date 2022-01-07
 */
@RestController
@RequestMapping("/system/repair")
public class DormitoryRepairController extends BaseController
{
    @Autowired
    private IDormitoryRepairService dormitoryRepairService;

    /**
     * 查询宿舍维修管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:repair:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryRepair dormitoryRepair)
    {
        startPage();
        List<DormitoryRepair> list = dormitoryRepairService.selectDormitoryRepairList(dormitoryRepair);
        return getDataTable(list);
    }

    /**
     * 导出宿舍维修管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:repair:export')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryRepair dormitoryRepair)
    {
        List<DormitoryRepair> list = dormitoryRepairService.selectDormitoryRepairList(dormitoryRepair);
        ExcelUtil<DormitoryRepair> util = new ExcelUtil<DormitoryRepair>(DormitoryRepair.class);
        util.exportExcel(response, list, "宿舍维修管理数据");
    }

    /**
     * 获取宿舍维修管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:repair:query')")
    @GetMapping(value = "/{repairId}")
    public AjaxResult getInfo(@PathVariable("repairId") Long repairId)
    {
        return AjaxResult.success(dormitoryRepairService.selectDormitoryRepairByRepairId(repairId));
    }

    /**
     * 新增宿舍维修管理
     */
    @PreAuthorize("@ss.hasPermi('system:repair:add')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DormitoryRepair dormitoryRepair)
    {
        return dormitoryRepairService.insertDormitoryRepair(dormitoryRepair);
    }

    /**
     * 修改宿舍维修管理
     */
    @PreAuthorize("@ss.hasPermi('system:repair:edit')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryRepair dormitoryRepair)
    {
        return toAjax(dormitoryRepairService.updateDormitoryRepair(dormitoryRepair));
    }

    /**
     * 删除宿舍维修管理
     */
    @PreAuthorize("@ss.hasPermi('system:repair:remove')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{repairIds}")
    public AjaxResult remove(@PathVariable Long[] repairIds)
    {
        return toAjax(dormitoryRepairService.deleteDormitoryRepairByRepairIds(repairIds));
    }


    /**
     * 接受宿舍维修计划管理
     */
    @PreAuthorize("@ss.hasPermi('system:repair:accept')")
    @Log(title = "宿舍维修管理", businessType = BusinessType.UPDATE)
    @PutMapping("/accept")
    public AjaxResult accept(@RequestBody DormitoryRepair dormitoryRepair)
    {
        return toAjax(dormitoryRepairService.updateDormitoryRepairByName(dormitoryRepair));
    }
}
