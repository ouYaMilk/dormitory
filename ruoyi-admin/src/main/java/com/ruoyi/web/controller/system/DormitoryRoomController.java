package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.entity.SysUser;
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
import com.ruoyi.system.domain.DormitoryRoom;
import com.ruoyi.system.service.IDormitoryRoomService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍房间管理Controller
 * 
 * @author zhb
 * @date 2022-01-10
 */
@RestController
@RequestMapping("/system/room")
public class DormitoryRoomController extends BaseController
{
    @Autowired
    private IDormitoryRoomService dormitoryRoomService;

    /**
     * 查询宿舍房间管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:room:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryRoom dormitoryRoom)
    {
        startPage();
        List<DormitoryRoom> list = dormitoryRoomService.selectDormitoryRoomList(dormitoryRoom);
        return getDataTable(list);
    }

    /**
     * 导出宿舍房间管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:room:export')")
    @Log(title = "宿舍房间管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryRoom dormitoryRoom)
    {
        List<DormitoryRoom> list = dormitoryRoomService.selectDormitoryRoomList(dormitoryRoom);
        ExcelUtil<DormitoryRoom> util = new ExcelUtil<DormitoryRoom>(DormitoryRoom.class);
        util.exportExcel(response, list, "宿舍房间管理数据");
    }

    /**
     * 获取宿舍房间管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:room:query')")
    @GetMapping(value = "/{dormitoryId}")
    public AjaxResult getInfo(@PathVariable("dormitoryId") String dormitoryId)
    {
        return AjaxResult.success(dormitoryRoomService.selectDormitoryRoomByDormitoryId(dormitoryId));
    }
    /**
     * 状态修改
     */
    @PreAuthorize("@ss.hasPermi('system:room:edit')")
    @Log(title = "宿舍房间管理", businessType = BusinessType.UPDATE)
    @PutMapping("/changeState")
    public AjaxResult changeState(@RequestBody DormitoryRoom user)
    {
        user.setUpdateBy(getUsername());
        return toAjax(dormitoryRoomService.updateUserState(user));
    }

    /**
     * 新增宿舍房间管理
     */
    @PreAuthorize("@ss.hasPermi('system:room:add')")
    @Log(title = "宿舍房间管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DormitoryRoom dormitoryRoom)
    {
        return toAjax(dormitoryRoomService.insertDormitoryRoom(dormitoryRoom));
    }

    /**
     * 修改宿舍房间管理
     */
    @PreAuthorize("@ss.hasPermi('system:room:edit')")
    @Log(title = "宿舍房间管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryRoom dormitoryRoom)
    {
        return toAjax(dormitoryRoomService.updateDormitoryRoom(dormitoryRoom));
    }

    /**
     * 删除宿舍房间管理
     */
    @PreAuthorize("@ss.hasPermi('system:room:remove')")
    @Log(title = "宿舍房间管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dormitoryIds}")
    public AjaxResult remove(@PathVariable String[] dormitoryIds)
    {
        return toAjax(dormitoryRoomService.deleteDormitoryRoomByDormitoryIds(dormitoryIds));
    }
}
