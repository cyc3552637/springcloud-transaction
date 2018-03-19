# springcloud-transaction  
springcloud+druid 1.16+lcn 4.1  

# 缺省内容  
注册中心和zipkin缺省  

# 事物处理  

事物发起方:  
@TxTransaction(isStart=true)  
@Transactional  
public String insert2(String name) {  
int num1=rpcserverservice.insert(name);  
int num2=userdao.register("2",name,"2");  
return " i am from port:" +port+"   statue1"+num1+"   statue2"+num2;}  
  
事物被调用方：    
@Transactional  
@TxTransaction  
public int insert(String name) {  
int num=userdao.register("1",name,"1");  
return num;}  
  
事物控制器：  
TxManager  
  
# 监控地址 
  
事物发起方druid监控地址：http://localhost:8766/druid/  
  
事物被调用方druid监控地址: http://localhost:8765/druid/  
  
事物控制器TxManager监控地址：http://localhost:8899/  
  
