package com.julianamelendez.app_login;

import com.julianamelendez.app_login.auth.Authenticador;
import com.julianamelendez.app_login.auth.factory.AuthenticatorFactory;
import com.julianamelendez.app_login.auth.type.BasicAuthenticador;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class AppLoginApplicationTests {


	@Test
	public void testAuthenticatorFactory(){
		AuthenticatorFactory authfactory = new AuthenticatorFactory();

		Authenticador basic = authfactory.getAuthenticador("basic");
		Assert.assertNotNull(basic);
		Assert.assertTrue(basic instanceof BasicAuthenticador);
	}

}
