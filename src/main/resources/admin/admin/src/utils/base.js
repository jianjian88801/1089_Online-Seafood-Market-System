const base = {
    get() {
        return {
            url : "http://localhost:8080/wangluohaixianshicang/",
            name: "wangluohaixianshicang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wangluohaixianshicang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网络海鲜市场系统"
        } 
    }
}
export default base
