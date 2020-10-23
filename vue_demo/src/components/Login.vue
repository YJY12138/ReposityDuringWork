<template>
  <el-form class="login-container" label-position="left"
           label-width="0px">
    <h3 class="login_title">系统登录</h3>
    <el-form-item>
      <el-input type="text" v-model="loginForm.username"
                auto-complete="off" placeholder="账号"></el-input>
    </el-form-item>
    <el-form-item>
      <el-input type="password" v-model="loginForm.password"
                auto-complete="off" placeholder="密码"></el-input>
    </el-form-item>
    <el-form-item style="width: 100%">
      <el-button type="primary" style="width: 100%;background: #505458;border: none" v-on:click="login">登录</el-button>
    </el-form-item>
  </el-form>
</template>

<script>

export default {
  name: 'Login',
  data () {
    return {
      loginForm: {
        username: '',
        password: ''
      },
      responseResult: []
    }
  },
  methods: {
    login () {
        this.$axios
            .post('handle/start', {
              username: this.loginForm.username,
              password: this.loginForm.password
            },{
              headers: {'X-CSRFToken': this.getCookie('csrftoken')}
            })
            .then(successResponse => {
              console.log(successResponse.data)
              if (successResponse.data.code ==="00") {
                this.$router.replace({path: '/tab'})
              }else {
                alert("账号或密码错误")
              }
            })
    },
    getCookie (name) {
      var value = '; ' + document.cookie
      var parts = value.split('; ' + name + '=')
      if (parts.length === 2) return parts.pop().split(';').shift()
    },
  }
}
</script>


<style>
body{
  background: url("../assets/img/back.jpg") no-repeat;
  background-size: 100%;
}
.login-container {
  border-radius: 15px;
  background-clip: padding-box;
  margin-top: 18%;
  margin-left: 60%;
  width: 350px;
  padding: 35px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}

.login_title {
  margin: 0px auto 40px auto;
  text-align: center;
  color: #505458;
}

</style>

