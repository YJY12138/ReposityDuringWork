import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from "@/components/Login";
import Home from "@/components/Home";
import Component_1 from "@/components/Component_1";
import Component_2 from "@/components/Component_2";
import Tab from "@/components/Tab";

Vue.use (VueRouter)

const routes=[
    {
        path: '/',
        redirect:'/login',
    },
    {
        path: '/tab',
        name: 'Tab',
        component: Tab,
        children:[
            {
                path: '/home',
                name: 'Home',
                component: Home,
                meta: { requiresAuth: true }
            },
            {
                path: '/Component1',
                name: 'Component1',
                component:Component_1,
                meta: { requiresAuth: true }
            },
            {
                path: '/Component2',
                name: 'Component_2',
                component:Component_2,
                meta: { requiresAuth: true }
            }
        ]
    },
    {
        path: '/login',
        name: 'Login',
        component: Login
    },
    {
        path: '/home',
        name: 'Home',
        component: Home
    },
]

const  router=new VueRouter({
    mode:'history',
    base:process.env.BAS_URL,
    routes,
    linkActiveClass:'active'
})

export default router
