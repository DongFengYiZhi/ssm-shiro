package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    @Test
    public void test(){

    }
    public Map<Integer,String> transform(List<Object[]> objects){
        Map<Integer,String> map=new HashMap<>();
        for (Object[] objs: objects) {//遍历list
            Integer key= (Integer)objs[0];//数组第一个为key,先取出
            if( map.get(key)==null){//尝试用这个key从map里取出value, 如果这个key没有值(null)
                map.put(key,objs[1].toString());//则把这个Object[]的值用这个key存起来
            }else{
                map.put(key, map.get(key)/*这个key存在,则取出以前的*/+objs[1]/*和新的值拼接*/);
            }
        }
        return map;
    }
}