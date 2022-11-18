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
import com.ruoyi.system.domain.DormitoryRoomPoint;
import com.ruoyi.system.service.IDormitoryRoomPointService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 宿舍卫生评分Controller
 * 
 * @author 朱鸿斌
 * @date 2022-04-28
 */
@RestController
@RequestMapping("/system/point")
public class DormitoryRoomPointController extends BaseController
{
    @Autowired
    private IDormitoryRoomPointService dormitoryRoomPointService;

    /**
     * 查询宿舍卫生评分列表
     */
    @PreAuthorize("@ss.hasPermi('system:point:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryRoomPoint dormitoryRoomPoint)
    {
        startPage();
        List<DormitoryRoomPoint> list = dormitoryRoomPointService.selectDormitoryRoomPointList(dormitoryRoomPoint);
        return getDataTable(list);
    }

    /**
     * 导出宿舍卫生评分列表
     */
    @PreAuthorize("@ss.hasPermi('system:point:export')")
    @Log(title = "宿舍卫生评分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryRoomPoint dormitoryRoomPoint)
    {
        List<DormitoryRoomPoint> list = dormitoryRoomPointService.selectDormitoryRoomPointList(dormitoryRoomPoint);
        ExcelUtil<DormitoryRoomPoint> util = new ExcelUtil<DormitoryRoomPoint>(DormitoryRoomPoint.class);
        util.exportExcel(response, list, "宿舍卫生评分数据");
    }

    /**
     * 导入
     * @param file
     * @param updateSupport
     * @return
     * @throws Exception
     */
    @Log(title = "用户管理", businessType = BusinessType.IMPORT)
    @PreAuthorize("@ss.hasPermi('system:point:import')")
    @PostMapping("/importData")
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<DormitoryRoomPoint> util = new ExcelUtil<DormitoryRoomPoint>(DormitoryRoomPoint.class);
        List<DormitoryRoomPoint> userList = util.importExcel(file.getInputStream());
        String operName = getUsername();
        String message = dormitoryRoomPointService.importUser(userList, updateSupport, operName);
        return AjaxResult.success(message);
    }

    /**
     * 下载模板
     * @param response
     */
    @PostMapping("/importTemplate")
    public void importTemplate(HttpServletResponse response)
    {
        ExcelUtil<DormitoryRoomPoint> util = new ExcelUtil<DormitoryRoomPoint>(DormitoryRoomPoint.class);
        util.importTemplateExcel(response, "宿舍卫生评分数据");
    }

    /**
     * 获取宿舍卫生评分详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:point:query')")
    @GetMapping(value = "/{dormitoryId}")
    public AjaxResult getInfo(@PathVariable("dormitoryId") String dormitoryId)
    {
        return AjaxResult.success(dormitoryRoomPointService.selectDormitoryRoomPointByDormitoryId(dormitoryId));
    }

    /**
     * 新增宿舍卫生评分
     */
    @PreAuthorize("@ss.hasPermi('system:point:add')")
    @Log(title = "宿舍卫生评分", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DormitoryRoomPoint dormitoryRoomPoint)
    {
        return toAjax(dormitoryRoomPointService.insertDormitoryRoomPoint(dormitoryRoomPoint));
    }

    /**
     * 修改宿舍卫生评分
     */
    @PreAuthorize("@ss.hasPermi('system:point:edit')")
    @Log(title = "宿舍卫生评分", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryRoomPoint dormitoryRoomPoint)
    {
        return toAjax(dormitoryRoomPointService.updateDormitoryRoomPoint(dormitoryRoomPoint));
    }

    /**
     * 删除宿舍卫生评分
     */
    @PreAuthorize("@ss.hasPermi('system:point:remove')")
    @Log(title = "宿舍卫生评分", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pointKeys}")
    public AjaxResult remove(@PathVariable String[] pointKeys)
    {
        return toAjax(dormitoryRoomPointService.deleteDormitoryRoomPointByDormitoryIds(pointKeys));
    }
}
