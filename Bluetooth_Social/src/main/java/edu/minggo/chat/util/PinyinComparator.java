package edu.minggo.chat.util;

import java.util.Comparator;
/**
 * 拼音比较器
 * @author minggo
 * @created 2013-1-30下午07:29:14
 */
@SuppressWarnings("rawtypes")
public class PinyinComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		 String str1 = PingYinUtil.getPingYin((String) o1);
	     String str2 = PingYinUtil.getPingYin((String) o2);
	     return str1.compareTo(str2);
	}

}
