package sounddown.ciudadano.features;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import sounddown.ciudadano.steps.SoundDownSteps;




@RunWith(SerenityRunner.class)
public class SerenityAppiumTest {
	
	
	@Managed(driver = "appium")
	WebDriver driver;
	
	@Steps
	SoundDownSteps SoundDown;
	

	@Test
	public void medicionCuandoNoExcedeElNivelDeRuido() {
			SoundDown.deslizarMenu();
			SoundDown.seleccionarItemSonometro();
			SoundDown.iniciarMedicion();
			SoundDown.resultado();
	}
	
	@Test
	public void medicionCuandoExcedeElNivelDeRuido() {
			SoundDown.deslizarMenu();
			SoundDown.seleccionarItemSonometro();
			SoundDown.iniciarMedicion();
			SoundDown.seleccionarSiParaEnviarNotificacion();
			SoundDown.seleccionarFuenteDesconocida();
			SoundDown.esperarMensajeDeConfirmacionDeEnvio();
	}
	
	
	@Test
	public void medicionSinInternet() {
			SoundDown.notificaQueAlgunasFuncionalidadesNoFuncionaranCorrectamente();
			SoundDown.clickEnAceptarQueAlgunasFuncionalidadesNoFuncionaran();
			SoundDown.deslizarMenu();
			SoundDown.seleccionarItemSonometro();
			SoundDown.iniciarMedicion();
			SoundDown.notificaErrorDeCarga();
			SoundDown.clickEnAceptarElErrorDeCarga();
			SoundDown.resultado();
	}
	
	@Test
	public void medicionConGPSDesactivado() {
			SoundDown.notificaQueElGpsEstaApagadoYDaLaOpcionDeEncerder();
			SoundDown.clickEnLaOpcionDeNoEncederElGPS();
			SoundDown.deslizarMenu();
			SoundDown.seleccionarItemSonometro();
			SoundDown.iniciarMedicion();
			SoundDown.notificaQueNoSePuedeObtenerLaUbicacion();
			SoundDown.clickEnAceptarQueNoSePuedeObtenerLaUbicacion();
			SoundDown.resultado();
	}
	
	  

}
