<template>
  <div>
    <router-link to="/home">首页</router-link>
    <router-link to="/login">登录页</router-link>
    <router-link to="/Component1">组件1</router-link>
    <router-link to="/Component2">组件2</router-link>
    <router-view/>

  </div>
</template>

<script>
export default {
  name: "Tab",


}
</script>

<style scoped>

</style>