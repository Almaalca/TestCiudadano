package sounddown.ciudadano.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class SoundDownScreen extends PageObject {

	final static String groupIdApp = "com.example.aldis.sounddownciudadano:id/";
	WebDriverWait wait;
	WebDriver driver;
	
	public SoundDownScreen(WebDriver driver) {
		 this.driver = driver;
		
		 wait = new WebDriverWait(driver, 30);
	}
	
	
	@AndroidFindBy( xpath="//*[@contentDescription='Open navigation drawer']")
	private WebElement menu;

	@AndroidFindBy(uiAutomator="text(\"Sonometro\")")
	private WebElement sonometro;
	
	
	@AndroidFindBy(id = groupIdApp + "buttonStart")
	private WebElement buttonMedir;
	
	
	@AndroidFindBy(id = groupIdApp + "resultado")
	private WebElement resultado;
	
	
	@AndroidFindBy(id =  "android:id/button1")
	private WebElement siEnviar;
	
	
	@AndroidFindBy(uiAutomator= "text(\"Desconocida\")")
	private WebElement opcionDesconocida;
	
	@AndroidFindBy(id = groupIdApp + "snackbar_text")
	private WebElement snackbarDialogo;
	
	@AndroidFindBy(uiAutomator= "text(\"ACEPTAR\")")
	private WebElement opcionAceptar;
	
	
	@AndroidFindBy(uiAutomator= "text(\"NO\")")
	private WebElement opcionNo;
	
	  public void scrollMenu(){
	       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@contentDescription='Open navigation drawer']")));
	       menu.click();
	    }
	
	  
	  public void selectSonometro(){
	        sonometro.click();
	    }
	  
	  
	  public void soundLevelMeter(){
	        buttonMedir.click();

	    }
	  
	  public void resultado(){
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultado")));
	        Assert.assertNotNull(resultado);
	    }
	  
	  
	   public void seleccionarSiParaEnviarNotificacion() {
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button1")));
		   siEnviar.click();
		}
		
		
	
		public void seleccionarFuenteDesconocida() {
			opcionDesconocida.click();
		}
		
		
		
		public void esperarMensajeDeEnvio() {
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Procesando el envio de notificación']")));
		}
		
		
	
		public void esperarMensajeDeConfirmacionDeEnvio() {
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Notificación enviada con éxito']")));
		}
	
	
		public void notificaQueAlgunasFuncionalidadesNoFuncionaranCorrectamente() {
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='No tiene acceso a internet. Algunas de las funcionalidades no se realizarán.']")));
		}
		
		public void clickEnAceptarQueAlgunasFuncionalidadesNoFuncionaran() {
			opcionAceptar.click();
		}
		
		public void notificaErrorDeCarga() {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Error de Carga']")));
		}
		
		public void clickEnAceptarElErrorDeCarga() {
			opcionAceptar.click();
		}
		
		public void notificaQueElGpsEstaApagadoYDaLaOpcionDeEncerder() {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='GPS Desactivado']")));
		}
		
		public void clickEnLaOpcionDeNoEncederElGPS() {
			opcionNo.click();
		}
		
		public void notificaQueNoSePuedeObtenerLaUbicacion() {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Problema de Ubicacion']")));
		}
		
		public void clickEnAceptarQueNoSePuedeObtenerLaUbicacion() {
			opcionAceptar.click();
		}
		
}
