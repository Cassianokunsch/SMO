package Run;

import Model.Pessoa;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreatBD {

    public static void main(String[] args) {
        AnnotationConfiguration config = new AnnotationConfiguration();
        //config.addAnnotatedClass(Pessoa.class);
        config.configure("hibernate.cfg.xml");
        
        new SchemaExport(config).create(true, true);

    }

}
