package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Timer timerBean = applicationContext.getBean(Timer.class);
        Long timeFirst = timerBean.getTime();
        Long timeSecond = 0L;

        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
            System.out.println("timeFirst= " + timeFirst);
            timeSecond = applicationContext.getBean(Timer.class).getTime();
            System.out.println("timeSecond= " + timeSecond);
        }
    }

}
