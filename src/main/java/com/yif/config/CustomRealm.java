/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.config;

/**
 * @author heyif
 * @since v1.0 2018-10-29T20:47
 */
//public class CustomRealm extends AuthorizingRealm {
//
//    private UserMapper userMapper;
//
//    @Autowired
//    private void setUserMapper(UserMapper userMapper){
//        this.userMapper = userMapper;
//    }
//
//    /**
//     * 获取授权信息
//     * 权限认证
//     *
//     * @param principalCollection
//     * @return
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String username = (String) SecurityUtils.getSubject().getPrincipal();
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        //获取用户角色
//        String role = userMapper.getRole(username);
//        Set<String> set = new HashSet<>();
//        set.add(role);
//        //设置用户角色
//        info.setRoles(set);
//        return info;
//    }
//
//    /**
//     * 获取身份验证信息
//     * 身份认证
//     *
//     * @param authenticationToken   用户身份信息token
//     * @return
//     * @throws AuthenticationException
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        //从数据库获取响应的用户名密码
//        String password = userMapper.getPassword(token.getUsername());
//        if (null==password){
//            throw new AccountException("用户名不正确");
//        }else if(!password.equals(new String((char[]) token.getCredentials()))){
//            throw new AccountException("密码不正确");
//        }
//        return new SimpleAuthenticationInfo(token.getPrincipal(), password, getName());
//
//    }
//}
