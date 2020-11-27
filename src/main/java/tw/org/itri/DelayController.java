package tw.org.itri;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DelayController {

	@RequestMapping(value = "/delay")
	public String sayHello() {
		InetAddress address = null;
		try {
			address = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "IP Address:- " + address.getHostAddress() + ", Result : " + fib(30);
	}

	public static long fib(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
}
