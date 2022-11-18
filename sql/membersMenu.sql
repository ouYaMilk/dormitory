-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍成员管理', '3', '1', 'members', 'system/members/index', 1, 0, 'C', '0', '0', 'system:members:list', '#', 'admin', sysdate(), '', null, '宿舍成员管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍成员管理查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:members:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍成员管理新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:members:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍成员管理修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:members:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍成员管理删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:members:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('宿舍成员管理导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:members:export',       '#', 'admin', sysdate(), '', null, '');