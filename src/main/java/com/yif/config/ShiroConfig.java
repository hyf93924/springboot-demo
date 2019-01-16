/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.config;

/**
 * Shiro配置类
 *
 * @author heyif
 * @since v1.0 2018-10-29T20:30
 */
//@Configuration
//public class ShiroConfig {
//
//    @Bean
//    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        //设置securityManager
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        //
//        shiroFilterFactoryBean.setLoginUrl("/notLogin");
//        //设置无权限时跳转url
//        shiroFilterFactoryBean.setUnauthorizedUrl("/noRole");
//
//        //设置拦截器
//        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//        //开放权限
//        filterChainDefinitionMap.put("/guest/**","anon");
//
//        filterChainDefinitionMap.put("/test/**","anon");
//        filterChainDefinitionMap.put("/dist/**","anon");
//        filterChainDefinitionMap.put("/index.html","anon");
//        //用户，需要角色权限“user”
//        filterChainDefinitionMap.put("/user/**","roles[user]");
//        //需要“admin”权限
//        filterChainDefinitionMap.put("/admin/**","roles[admin]");
//        //开放登录
//        filterChainDefinitionMap.put("/login","anon");
//        //其余接口一律拦截，放在最后
//        filterChainDefinitionMap.put("/**","authc");
//
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//        System.out.println("Shiro拦截器工厂类注入成功");
//        return shiroFilterFactoryBean;
//    }
//
//    /**
//     * 注入SecurityManager
//     * @return
//     */
//    @Bean
//    public SecurityManager securityManager(){
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        //设置realm
//        securityManager.setRealm(customRealm());
//        return securityManager;
//    }
//
//    /**
//     * 自定义身份认证realm
//     * @return
//     */
//    @Bean
//    public CustomRealm customRealm(){
//        return new CustomRealm();
//    }
//}
