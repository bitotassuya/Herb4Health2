package com.example.asus.herb4health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.asus.herb4health.Adapterfood.Adapterfood;
import com.example.asus.herb4health.Commonflow.Commonflow;
import com.example.asus.herb4health.Model.Food;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class CoverFlowMain extends AppCompatActivity {

    FeatureCoverFlow coverFlow;
    Adapterfood adapterfood;
    TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_flow_main);

        //Create data First
        initData();
        adapterfood = new Adapterfood(Commonflow.foodList,this);
        coverFlow = (FeatureCoverFlow)findViewById(R.id.coverFlow);
        mTitle = (TextSwitcher)findViewById(R.id.mtitle);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(CoverFlowMain.this);
                TextView text = (TextView)inflater.inflate(R.layout.layout_title,null);
                return text;
            }
        });
        coverFlow.setAdapter(adapterfood);
        coverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(Commonflow.foodList.get(position).getTitle());
            }

            @Override
            public void onScrolling() {

            }
        });
        coverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CoverFlowMain.this,FoodDetail.class);
                intent.putExtra("food_index",i);
                startActivity(intent);
            }

        });
    }

    private void initData() {
        //Example data
        Food food = new Food("แกงเรียง",
                "แกงเลียง ถือเป็นเมนูที่มีประโยชน์มาก เพราะใส่ผักหลากหลายชนิด ไม่ว่าจะเป็น บวบ ฟักทอง ข้าวโพด ใบแมงลัก อาจจะใส่เห็ดหรือแครอทเพิ่มด้วยก็ได้ เนื้อสัตว์จะเป็นกุ้งหรือหมู ไก่ ก็ได้แล้วแต่คนชอบ แต่ละอย่างนี่สรรพคุณเป็นยาได้หมดเลย แถมยังมีกลิ่นหอม น่ารับประทานซะจริง\n" +
                        "\n" +
                        "ประโยชน์ :\n" +
                        "\n" +
                        "- ใบแมงลัก ช่วยรักษาไข้หวัด หลอดลมอักเสบ ขับลม\n" +
                        "\n" +
                        "- ฟักทอง บำรุงร่างกายและรักษาสายตา\n" +
                        "\n" +
                        "- บวบ บำรุงหัวใจ\n" +
                        "\n" +
                        "- ข้าวโพดอ่อน บำรุงกระเพาะอาหาร"
                ,R.drawable.food_menu);
        Commonflow.foodList.add(food);
         food = new Food("เมี่ยงคำ",
                "เมี่ยงคำ เมนูอาหารว่างสุดโปรดของใครหลายคน สรรพคุณเยอะเกินบรรยาย เพราะเครื่องของเมี่ยงคำก็คือ ผักสมุนไพรหลากหลายชนิด นั่นเอง ราดด้วยน้ำจิ้มหอมหวาน กินร่วมกับคนในครอบครัว ขอบอกเลยว่า มีความสุขสุดๆ ไปเลย\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "ประโยชน์ :\n" +
                        "\n" +
                        "- ขิง เปลือกมะนาว ช่วยบำรุงธาตุไฟ\n" +
                        "\n" +
                        "- มะนาว ใบชะพลู ช่วยบำรุงธาตุน้ำ\n" +
                        "\n" +
                        "- พริก หอมแดง ช่วยบำรุงธาตุลม\n" +
                        "\n" +
                        "- มะพร้าว กุ้งแห้ง น้ำตาล ช่วยบำรุงธาตุดิน\n" +
                        "\n" +
                        "นอกจากบำรุงธาตุแล้วก็ช่วยบำรุงร่างกายของเราหลายอย่าง ไม่ว่าจะเป็น แก้เสมหะ บำรุงกำลัง ขับลม ช่วยเจริญอาหารและขับพยาธิ"
                ,R.drawable.food_menu2);
        Commonflow.foodList.add(food);

        food = new Food("สะเดาน้ำปลาหวาน",
                "สะเดา จัดว่าเป็นอาหารที่อยู่คู่คนไทยมาเนิ่นนานจริงๆ เราเริ่มรับประทานสะเดากันมาตั้งแต่สมัยอยุธยา ภาคกลางมักกินสะเดากับน้ำปลาหวาน เพราะช่วยลดความขมของสะเดา และกินคู่กับปลาดุกย่าง แค่พูดก็หิวซะแล้วล่ะ งั้นมาดูประโยชน์กันดีกว่าว่าดีขนาดไหน ทำไมถึงควรกินสะเดาน้ำปลาหวาน\n" +
                        "\n" +
                        "ประโยชน์ :\n" +
                        "\n" +
                        "- แก้ไข้หัวลม\n" +
                        "\n" +
                        "- แก้ร้อนใน ขับเสมหะ ขับลม\n" +
                        "\n" +
                        "- ช่วยให้ย่อยอาหารดีขึ้น\n" +
                        "\n" +
                        "- ช่วยบำรุงธาตุน้ำและไฟในร่างกายได้ดี"
                ,R.drawable.food_menu3);
        Commonflow.foodList.add(food);



        /* food = new Food("เมี่ยงคำ",
                "อร่อย"
                ,R.drawable.ginkgobiloba);
        Commonflow.foodList.add(food); */

    }
}
