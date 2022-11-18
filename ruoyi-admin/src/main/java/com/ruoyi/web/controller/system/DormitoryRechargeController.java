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
import com.ruoyi.system.domain.DormitoryRecharge;
import com.ruoyi.system.service.IDormitoryRechargeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 宿舍充值管理Controller
 * 
 * @author ruoyi
 * @date 2022-01-07
 */
@RestController
@RequestMapping("/system/recharge")
public class DormitoryRechargeController extends BaseController
{
    @Autowired
    private IDormitoryRechargeService dormitoryRechargeService;

    /**
     * 查询宿舍充值管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:list')")
    @GetMapping("/list")
    public TableDataInfo list(DormitoryRecharge dormitoryRecharge)
    {
        startPage();
        List<DormitoryRecharge> list = dormitoryRechargeService.selectDormitoryRechargeList(dormitoryRecharge);
        return getDataTable(list);
    }

    /**
     * 导出宿舍充值管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:export')")
    @Log(title = "宿舍充值管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DormitoryRecharge dormitoryRecharge)
    {
        List<DormitoryRecharge> list = dormitoryRechargeService.selectDormitoryRechargeList(dormitoryRecharge);
        ExcelUtil<DormitoryRecharge> util = new ExcelUtil<DormitoryRecharge>(DormitoryRecharge.class);
        util.exportExcel(response, list, "宿舍充值管理数据");
    }

    /**
     * 获取宿舍充值管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:query')")
    @GetMapping(value = "/{rechargeId}")
    public AjaxResult getInfo(@PathVariable("rechargeId") Long rechargeId)
    {
        return AjaxResult.success(dormitoryRechargeService.selectDormitoryRechargeByRechargeId(rechargeId));
    }

    /**
     * 新增宿舍充值管理
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:add')")
    @Log(title = "宿舍充值管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DormitoryRecharge dormitoryRecharge)
    {
        return dormitoryRechargeService.insertDormitoryRecharge(dormitoryRecharge);
    }

    /**
     * 修改宿舍充值管理
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:edit')")
    @Log(title = "宿舍充值管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DormitoryRecharge dormitoryRecharge)
    {
        return toAjax(dormitoryRechargeService.updateDormitoryRecharge(dormitoryRecharge));
    }

    /**
     * 删除宿舍充值管理
     */
    @PreAuthorize("@ss.hasPermi('system:recharge:remove')")
    @Log(title = "宿舍充值管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rechargeIds}")
    public AjaxResult remove(@PathVariable Long[] rechargeIds)
    {
        return toAjax(dormitoryRechargeService.deleteDormitoryRechargeByRechargeIds(rechargeIds));
    }
}
