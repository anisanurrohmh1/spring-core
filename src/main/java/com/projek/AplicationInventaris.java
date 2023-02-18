package com.projek;

import com.projek.config.SettingBean;
import com.projek.model.Inventaris;
import com.projek.service.IInventaris;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AplicationInventaris {

    static IInventaris inventarisService ;

    public static void main(String[] args) {
        //with xaml
        // inisiasi context
    //    ApplicationContext AppCtxInventaris = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // panggil service
     //   InventarisImplemen serviceApp = (InventarisImplemen) AppCtxInventaris.getBean("inventarisService");


        //wtih annotasion
        ApplicationContext AppCtxInventaris2 = new AnnotationConfigApplicationContext();
        //regis bean
        ((AnnotationConfigApplicationContext) AppCtxInventaris2).register(SettingBean.class);
        ((AnnotationConfigApplicationContext) AppCtxInventaris2).refresh();

        //panggil service sama
        inventarisService = AppCtxInventaris2.getBean(IInventaris.class);
        //panggil model utk isi data
        Inventaris modelInven = new Inventaris();



   //     inventarisService = AppCtxInventaris.getBean(IInventaris.class);
        System.out.println("counterService object Id :" + inventarisService.hashCode());

        modelInven.setName("Meja Bundar");
        modelInven.setMerk("Sanken");
        modelInven.setPrice(200000);
        inventarisService.insert(modelInven);


        //add menggunakan service
   //     serviceApp.insert(modelInven);

        // ambil arraylist data ke dalam list juga dan tampilkan
 //       List<Inventaris> data = inventarisService.lists();
    //    System.out.println(data);
        printResult();


    }

    static private void printResult() {
        List<Inventaris> listData = inventarisService.lists();
        for (Inventaris loop : listData) {
            System.out.println(loop.toString());
        }
    }
}
