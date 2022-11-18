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
import com.ruoyi.system.domain.DormitoryAccess;
import com.ruoyi.system.service.IDormitoryAccessService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍门禁管理Controller
 * 
 * @author 朱鸿斌
 * @date 2022-01-07
 */
@RestController
@RequestMapping("/system/access")
public class DormitoryAccessController extends BaseController
{
    @Autowired
    private IDormitoryAccessService dormitoryAccessService;

    /**
     * 查询宿舍门禁管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:access:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryAccess dormitoryAccess)
    {
        startPage();
        List<DormitoryAccess> list = dormitoryAccessService.selectDormitoryAccessList(dormitoryAccess);
        return getDataTable(list);
    }

    /**
     * 导出宿舍门禁管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:access:export')")
    @Log(title = "宿舍门禁管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryAccess dormitoryAccess)
    {
        List<DormitoryAccess> list = dormitoryAccessService.selectDormitoryAccessList(dormitoryAccess);
        ExcelUtil<DormitoryAccess> util = new ExcelUtil<DormitoryAccess>(DormitoryAccess.class);
        util.exportExcel(response, list, "宿舍门禁管理数据");
    }

    /**
     * 获取宿舍门禁管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:access:query')")
    @GetMapping(value = "/{accessId}")
    public AjaxResult getInfo(@PathVariable("accessId") Long accessId)
    {
        return AjaxResult.success(dormitoryAccessService.selectDormitoryAccessByAccessId(accessId));
    }

    /**
     * 新增宿舍门禁管理
     */
    @PreAuthorize("@ss.hasPermi('system:access:add')")
    @Log(title = "宿舍门禁管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DormitoryAccess dormitoryAccess)
    {
        return dormitoryAccessService.insertDormitoryAccess(dormitoryAccess);
    }

    /**
     * 修改宿舍门禁管理
     */
    @PreAuthorize("@ss.hasPermi('system:access:edit')")
    @Log(title = "宿舍门禁管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryAccess dormitoryAccess)
    {
        return toAjax(dormitoryAccessService.updateDormitoryAccess(dormitoryAccess));
    }

    /**
     * 删除宿舍门禁管理
     */
    @PreAuthorize("@ss.hasPermi('system:access:remove')")
    @Log(title = "宿舍门禁管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{accessIds}")
    public AjaxResult remove(@PathVariable Long[] accessIds)
    {
        return toAjax(dormitoryAccessService.deleteDormitoryAccessByAccessIds(accessIds));
    }
}
