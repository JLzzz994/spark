package interceptor;

import com.atguigu.flume.interceptor.LogUtils;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LogUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>12�� 13, 2019</pre> 
* @version 1.0 
*/ 
public class LogUtilsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: testValidateEvent(String log)
*
*/ 
@Test
public void testValidateEvent() throws Exception {

    boolean b = LogUtils.validateEvent("1549696569054 | {\"cm\":{\"ln\":\"-89.2\",\"sv\":\"V2.0.4\",\"os\":\"8.2.0\",\"g\":\"M67B4QYU@gmail.com\",\n" +
            "         \"nw\":\"4G\",\"l\":\"en\",\"vc\":\"18\",\"hw\":\"1080*1920\",\"ar\":\"MX\",\"uid\":\"u8678\",\"t\":\"1549679122062\",\n" +
            "         \"la\":\"-27.4\",\"md\":\"sumsung-12\",\"vn\":\"1.1.3\",\"ba\":\"Sumsung\",\"sr\":\"Y\"},\n" +
            "         \"ap\":\"weather\",\n" +
            "         \"et\":[]}");
    System.out.println(b);
}


/** 
* 
* Method: validateStart(String log) 
* 
*/ 
@Test
public void testValidateStart() throws Exception {
    boolean b = LogUtils.validateStart("{\"action\":\"1\",\"ar\":\"MX\",\"ba\":\"HTC\",\"detail\":\"542\",\"en\":\"start\",\"entry\":\"2\",\n" +
            "        \"extend1\":\"\",\"g\":\"S3HQ7LKM@gmail.com\",\"hw\":\"640*960\",\"l\":\"en\",\"la\":\"-43.4\",\n" +
            "        \"ln\":\"-98.3\",\"loading_time\":\"10\",\"md\":\"HTC-5\",\"mid\":\"993\",\"nw\":\"WIFI\",\"open_ad_type\":\"1\",\n" +
            "        \"os\":\"8.2.1\",\"sr\":\"D\",\"sv\":\"V2.9.0\",\"t\":\"1559551922019\",\"uid\":\"993\",\"vc\":\"0\",\"vn\":\"1.1.5\"}");
    System.out.println(b);
} 


} 
