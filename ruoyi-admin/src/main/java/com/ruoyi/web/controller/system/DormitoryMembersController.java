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
import com.ruoyi.system.domain.DormitoryMembers;
import com.ruoyi.system.service.IDormitoryMembersService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍成员管理Controller
 * 
 * @author zhb
 * @date 2022-01-10
 */
@RestController
@RequestMapping("/system/members")
public class DormitoryMembersController extends BaseController
{
    @Autowired
    private IDormitoryMembersService dormitoryMembersService;

    /**
     * 查询宿舍成员管理列表
     */
    //@PreAuthorize("@ss.hasPermi('system:members:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryMembers dormitoryMembers)
    {
        startPage();
        List<DormitoryMembers> list = dormitoryMembersService.selectDormitoryMembersList(dormitoryMembers);
        return getDataTable(list);
    }

    /**
     * 导出宿舍成员管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:members:export')")
    @Log(title = "宿舍成员管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryMembers dormitoryMembers)
    {
        List<DormitoryMembers> list = dormitoryMembersService.selectDormitoryMembersList(dormitoryMembers);
        ExcelUtil<DormitoryMembers> util = new ExcelUtil<DormitoryMembers>(DormitoryMembers.class);
        util.exportExcel(response, list, "宿舍成员管理数据");
    }

    /**
     * 获取宿舍成员管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:members:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(dormitoryMembersService.selectDormitoryMembersById(id));
    }

    /**
     * 新增宿舍成员管理
     */
    @PreAuthorize("@ss.hasPermi('system:members:add')")
    @Log(title = "宿舍成员管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DormitoryMembers dormitoryMembers)
    {
        return dormitoryMembersService.insertDormitoryMembers(dormitoryMembers);
    }

    /**
     * 修改宿舍成员管理
     */
    @PreAuthorize("@ss.hasPermi('system:members:edit')")
    @Log(title = "宿舍成员管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryMembers dormitoryMembers)
    {
        return dormitoryMembersService.updateDormitoryMembers(dormitoryMembers);
    }

    /**
     * 删除宿舍成员管理
     */
    @PreAuthorize("@ss.hasPermi('system:members:remove')")
    @Log(title = "宿舍成员管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dormitoryMembersService.deleteDormitoryMembersByIds(ids));
    }
}
