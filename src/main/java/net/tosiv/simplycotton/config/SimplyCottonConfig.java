package net.tosiv.simplycotton.config;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import net.tosiv.simplycotton.SimplyCotton;

import java.nio.file.Files;
import java.util.Collections;

public class SimplyCottonConfig {
    private boolean renderToolTip;

    public SimplyCottonConfig(boolean renderToolTip){
        this.renderToolTip = renderToolTip;
    }

    public boolean shouldRenderToolTip(){
        return renderToolTip;
    }

    public static void readData(){

        SimplyCotton.config=null;
        SimplyCotton.configData = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        try{
            if (SimplyCotton.configPath.toFile().exists()){
                SimplyCotton.config= SimplyCotton.configData.fromJson(new String(Files.readAllBytes(SimplyCotton.configPath)),SimplyCottonConfig.class);
            }else{
                SimplyCotton.config= new SimplyCottonConfig(true);
                Files.write(SimplyCotton.configPath, Collections.singleton(SimplyCotton.configData.toJson(SimplyCotton.config)));

            }

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
