module.exports = {  
  outputDir: "../src/main/resources/app",  
  indexPath: "../app/index.html",  
  devServer: {  
    proxy: "http://localhost:8080"  
  },  
  chainWebpack: config => {  
    const svgRule = config.module.rule("svg");    
    svgRule.uses.clear();    
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");  
  }  
};