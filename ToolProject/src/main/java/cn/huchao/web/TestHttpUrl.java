package cn.huchao.web;

/**
 * 2017年7月22日  huchao
 *	@description
 *
 */
public class TestHttpUrl {
	public static void main(String[] args) {
		String[] arrName = {"a","b","c"};
		String[] arrValue = {"1","2","3"};
		System.out.println(getUrl(arrName, arrValue));
	}

	public static String getUrl(String[] arrName, String[] arrValue) {
		String url = "?";
		StringBuilder sb = new StringBuilder(url);
		for (int i = 0; i < arrName.length; i++) {
			sb.append(arrName[i]).append("=").append(arrValue[i]).append("&");
		}
		return sb.substring(0, sb.length() - 1);
	}
}
