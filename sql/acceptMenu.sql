-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务指派', '3', '1', 'accept', 'system/accept/index', 1, 0, 'C', '0', '0', 'system:accept:list', '#', 'admin', sysdate(), '', null, '任务指派菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务指派查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:accept:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务指派新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:accept:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务指派修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:accept:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务指派删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:accept:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('任务指派导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:accept:export',       '#', 'admin', sysdate(), '', null, '');