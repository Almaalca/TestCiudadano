package sounddown.ciudadano.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.annotations.Step;
import sounddown.ciudadano.pages.SoundDownScreen;

public class SoundDownSteps {


	
	private  SoundDownScreen onSoundDownScreen;
	
		@Step
		  public void deslizarMenu(){
			  onSoundDownScreen.scrollMenu();
		    }
		
		@Step
		  public void seleccionarItemSonometro(){
			  onSoundDownScreen.selectSonometro();
		    }
		  
		@Step
		  public void iniciarMedicion(){
			  onSoundDownScreen.soundLevelMeter();

		    }
		  
		@Step
		  public void resultado(){
			  onSoundDownScreen.resultado();
		    }
		
		@Step
		public void seleccionarSiParaEnviarNotificacion() {
			onSoundDownScreen.seleccionarSiParaEnviarNotificacion();
		}
		
		
		@Step
		public void seleccionarFuenteDesconocida() {
			onSoundDownScreen.seleccionarFuenteDesconocida();
		}
		
		
		@Step
		public void esperarMensajeDeEnvio() {
			onSoundDownScreen.esperarMensajeDeEnvio();
		}
		
		
		@Step
		public void esperarMensajeDeConfirmacionDeEnvio() {
			onSoundDownScreen.esperarMensajeDeConfirmacionDeEnvio();
		}
	
		@Step
		public void notificaQueAlgunasFuncionalidadesNoFuncionaranCorrectamente() {
			onSoundDownScreen.notificaQueAlgunasFuncionalidadesNoFuncionaranCorrectamente();
		}
		
		@Step
		public void clickEnAceptarQueAlgunasFuncionalidadesNoFuncionaran() {
			onSoundDownScreen.clickEnAceptarQueAlgunasFuncionalidadesNoFuncionaran();
		}
		
		@Step
		public void notificaErrorDeCarga() {
			onSoundDownScreen.notificaErrorDeCarga();
		}
		
		@Step
		public void clickEnAceptarElErrorDeCarga() {
			onSoundDownScreen.clickEnAceptarElErrorDeCarga();
		}
		
		
		@Step
		public void notificaQueElGpsEstaApagadoYDaLaOpcionDeEncerder() {
			onSoundDownScreen.notificaQueElGpsEstaApagadoYDaLaOpcionDeEncerder();
		}
		
		@Step
		public void clickEnLaOpcionDeNoEncederElGPS() {
			onSoundDownScreen.clickEnLaOpcionDeNoEncederElGPS();
		}
		
		@Step
		public void notificaQueNoSePuedeObtenerLaUbicacion() {
			onSoundDownScreen.notificaQueNoSePuedeObtenerLaUbicacion();
		}
		
		@Step
		public void clickEnAceptarQueNoSePuedeObtenerLaUbicacion() {
			onSoundDownScreen.clickEnAceptarQueNoSePuedeObtenerLaUbicacion();
		}
		
		
		
	
}
