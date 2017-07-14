package cn.huchao.web;

import cn.huchao.util.HttpUtil;

/**
 * @author huchao
 *	@2017年7月3日
 *	@description
 *	
 */
public class HttpInstance {
	public static void main(String[] args) {
		//模板四
		String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-06+16%3A53%3A14%22%2C%22appuserid%22%3A%2255555555555%22%2C%22appid%22%3A%225000001448%22%2C%22payorderid%22%3A%222017070621001004140219221061%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170706165235423557153%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.03%2C%22waresid%22%3A1%2C%22requestid%22%3A%22ZFB20170706165239718619134%22%2C%22transid%22%3A%2232201707061652397063103%22%2C%22feetype%22%3A0%7D&sign=nJ8Iun5zN1GHv66VkaW5KH%2FkaGuGhVNOgT%2FjvoYnmSoVqM5%2FGaLNIVoasx1AEAwxJcr6%2B%2BI1k%2FBx%2FJXnGCsepIIRRyH3W1GYg%2BAJ4E7hTpRxElN5frDTsSnVNafcme7HqiVXUGoOunlEBheYfTTKk6I4R8RMUjMOuXrTNDruC0g%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder2?uid=order_0008";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);
		//模板三
	/*	String requestBody = "ctransdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-06+15%3A41%3A20%22%2C%22appuserid%22%3A%2218239639432%22%2C%22appid%22%3A%225000001448%22%2C%22payorderid%22%3A%222017070621001004140219023610%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170706153945949266985%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.02%2C%22waresid%22%3A1%2C%22requestid%22%3A%22ZFB20170706153949411704989%22%2C%22transid%22%3A%2232201707061539493404792%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%223333%5C%22%7D%22%7D&sign=QpnsziGJjm3TvDt2s9%2FmvfCnEgYzmICY1%2FFN5V1KfBI3C5XtVDezMBXWIX8rOgSNHsMbOa%2BvjBhx5oZ1u9RPa3pW2FGBNwhWh5yiCXLN5NtJhz6hD2h0Qu4Ri%2B9N5f10nGp2hc1nB19MJcakuKPjbAh%2B3k70rpGXqZ%2FznJLoLqw%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder?uid=order_0002";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//退款回调接口  /front/sh/refundOrder!callRefundOrder
		/*String requestBody = "transdata=%7B%22succdata%22%3A%2220170621151520971380128%5E0.01%22%2C%22faildata%22%3A%22%22%2C%22appid%22%3A%225000001448%22%2C%22notifytime%22%3A%222017-06-21+15%3A17%3A01%22%2C%22refundno%22%3A%2220170621151649143213%22%7D&sign=JBuet0Ez%2FyNlbrHWLY3jMHsd7k7MaBOtcBc7wrimaHR1rJve1qU%2FYGQCF1jOK21L6iydmNwKzWKcEA0ni%2FxFvl8BF0ZLTBFtfHtC5UC%2BvMNVI5zszIxmrpj2MhslVYvSZJXMt2z3CpTP9xz%2F%2F%2BnVSO5X2CXt6%2FZjoNoAjubzAVY%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/refundOrder!callRefundOrder?uid=refund_0006";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		/*String requestBody = "transdata=%7B%22cporderid%22%3A%2220170605182356546444668%22%2C%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-05+18%3A24%3A03%22%2C%22appuserid%22%3A%2218239639432%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.03%2C%22waresid%22%3A1%2C%22appid%22%3A%225000001448%22%2C%22feetype%22%3A0%2C%22transid%22%3A%2232201706051823565056130%22%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%222222%5C%22%7D%22%2C%22currency%22%3A%22RMB%22%7D&sign=WMS%2FySKwp7SH98VUHxvxDGLifazVGgCyM%2BeKr5FAFcore3WeA2swM3yTfXOo6QVrydkOsKQbSdOcZEj25IQCqBd8roVfeUrYbrXaJIu7NFQSxzA3Z%2Bm5SyGJ%2BFwE6tXj65l9d%2BAbz1Wgtt8%2FnnZuPepU70%2FxSG2PSB8pFvRuiKo%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder?uid=order_0002";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
	/*	User user =new User();
		user.setId(1000);*/
		//营销活动下单异步回调
	/*	String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-14+10%3A50%3A28%22%2C%22appuserid%22%3A%22188888888%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%222017071421001004140232930121%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170714104248671383759%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.01%2C%22waresid%22%3A1%2C%22requestid%22%3A%22ZFB20170714105004760724853%22%2C%22transid%22%3A%2232201707141042570540201%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%22188888888%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%253A%252F%252F192.168.100.51%253A20120%252Ftop%252Fcheck.html%5C%22%7D%22%7D&sign=hErL%2Bk3nJ7OkfgDrBmN9zLxSI2V5zC8TJH7AlnGN%2FgHY8WHoo%2BVx1V4fQJce0OGfueGLh7wRoto8LVmjsP5EnbXsMC4EALiJI%2BHsOVDTFbCGv6MEE%2BtcV9fdiJ2WKCIRjTRlcBnvHiBlKtXAZc0ezmyKLoNBi2XUJcLxRkqOeNo%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//访问测试环境
		/*String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-29+16%3A10%3A29%22%2C%22appuserid%22%3A%2213618901464%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%224008892001201706297982504519%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170629160611423772870%22%2C%22paytype%22%3A1002%2C%22money%22%3A0.06%2C%22waresid%22%3A1%2C%22requestid%22%3A%22WX20170629160848365046306%22%2C%22transid%22%3A%2232201706291606530939778%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%2213618901464%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%253A%252F%252F192.168.100.51%253A20120%252Ftop%252Fcheck.html%5C%22%7D%22%7D&sign=eLa7PnvfYG3%2BTv6s7dVoeV54Aa9aeGyJGX5eb6H8zbOCoK4rrSS07Wewg%2F28%2FEKKPaNdzXrLgdhzHzMzWhGDKqtH1NhLfkiOjf0XnuYszr9QbA8MPMf022rneuPsEwsoZuZaGpW0QTZIsMx1rs6sUFXpff%2Fdo65bDWAqx7%2BurSc%3D&signtype=RSA";
		String url = "http://192.168.100.51:20120/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		/*String url ="http://192.168.91.116:28090/top/front/sh/marketOrder!checkOrderPayStatus?uid=marketOrder_0002";
		String param = "";
		String result = HttpUtil.sendPost(url, param);
		System.out.println(result);*/
	}
}

