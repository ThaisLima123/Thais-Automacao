package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PesquisaStep {

    WebDriver driver = new ChromeDriver();

    @Dado("^que estou no site da google$")
    public void que_estou_no_site_da_google() {
        driver.get("https://www.google.com.br/");
    }

    @Quando("^digito na pesquisa o site da nttdata e clico em pesquisar$")
    public void digito_na_pesquisa_o_site_da_nttdata_e_clico_em_pesquisar() {
        WebElement campoPesquisar = driver.findElement(By.xpath("//textarea[@aria-label='Pesquisar']"));
        campoPesquisar.sendKeys("nttdata");
        campoPesquisar.sendKeys(Keys.ENTER);
    }

    @Então("^devo acessar o primeiro link apresentado na pesquisa$")
    public void devo_acessar_o_primeiro_link_apresentado_na_pesquisa() {
        WebElement linkElement = driver.findElement(By.xpath("//a[@href='https://nttdata-solutions.com/br/']"));
        linkElement.click();

        driver.quit();

    }

    @Dado("^que estou no site da ntt$")
    public void que_estou_no_site_da_ntt() {
        driver.get("https://nttdata-solutions.com/br/?utm_term=ntt%20data&utm_campaign=NOVO%20-%20%5BP%5D%20Branding&utm_source=adwords&utm_medium=ppc&hsa_acc=6608866874&hsa_cam=12627448046&hsa_grp=119455732985&hsa_ad=509959537851&hsa_src=g&hsa_tgt=kwd-320773906274&hsa_kw=ntt%20data&hsa_mt=p&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAjw9pGjBhB-EiwAa5jl3NUbJDugH_U5be1Wlaj8R-DTRv-yaqTDr-PE4taResHejcC0HbEomxoCxIEQAvD_BwE");
        driver.findElement(By.id("all")).click();
    }

    @Dado("^clico em carreira$")
    public void clico_em_carreira() {
        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]"))
                .click();
    }

    @Quando("^acesso junte-se a nossa equipe$")
    public void acesso_junte_se_a_nossa_equipe() {
        WebElement WebElement = driver.findElement(By.xpath("//a[@href='https://platform.senior.com.br/hcmrs/hcm/curriculo/?tenant=fhcombr&tenantdomain=fh.com.br#!/vacancies/list']"));
        WebElement.click();
        Set<String> janelas = driver.getWindowHandles();

        for (String janela : janelas) {
            driver.switchTo().window(janela);
            if (!driver.getTitle().equals("Carreiras e Oportunidades de Trabalho em SAP")) {
                break;
            }
        }
    }

    @Então("^em lista de vagas pesquiso por arquiteto$")
    public void em_lista_de_vagas_pesquiso_por_arquiteto() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id ='pesquisar-vaga-localidade-etc']")).sendKeys("Arquiteto");



    }
}
