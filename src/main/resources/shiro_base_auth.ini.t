[base_auth]
/corp/ent/list=login
/corp/**=login
/u/**=anon
/user/login=anon
/user/**=login
/js/**=anon
/css/**=anon 
/open/**=anon 
/u/logout.shtml=logout
/demo/**=anon
#不用校验地址是否有权限
/permission/selectPermissionById.shtml=login
/member/onlineDetails/**=login
/member/changeSessionStatus.shtml=login
/role/mypermission.shtml=login
/role/getPermissionTree.shtml=login
/role/selectRoleByUserId.shtml=login

 
#需要根据地址校验有无权限
/permission/**=login,permission
/role/**=login,permission
/member/**=login,permission
#需要校验是否有拥有角色
/system/**=role[888888]

/index=login
