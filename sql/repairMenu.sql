-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍维修管理', '4', '1', 'repair', 'system/repair/index', 1, 0, 'C', '0', '0', 'system:repair:list', '#', 'admin', sysdate(), '', null, '宿舍维修管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍维修管理查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:repair:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍维修管理新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:repair:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍维修管理修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:repair:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍维修管理删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:repair:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍维修管理导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:repair:export',       '#', 'admin', sysdate(), '', null, '');