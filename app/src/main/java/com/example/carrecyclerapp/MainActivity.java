package com.example.carrecyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView carRecyclerView;
    List<CarData> carlist;
    CarData cardata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carRecyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        carRecyclerView.setLayoutManager(gridLayoutManager);

        carlist = new ArrayList<>();

        cardata = new CarData("HONDA Jazz/Fit","A small MPV that has been on the market since 2000 and it is now on its fourth generation. The previous generations were available only as city-vehicles.",R.drawable.hondajazz,"ENGINE SPECS  –  1.3L CVT (98 HP)\n"+
                "\nCylinders: L4 \n\n" +
                "Displacement: 1317 cm3\n\n" +
                "Power:\n" +
                "    72.1 KW @ 6000 RPM\n" +
                "    98 HP @ 6000 RPM\n" +
                "    97 BHP @ 6000 RPM\n\n" +
                "Torque:\n" +
                "    87 lb-ft @ 5000 RPM\n" +
                "    118 Nm @ 5000 RPM\n\n" +
                "Fuel System: Direct Injection\n\n" +
                "Fuel: Gasoline");
        carlist.add(cardata);
        cardata = new CarData("HONDA Odyssey","The fifth generation of the big MPV from Honda was introduced on the market in 2018 and, in 2020, it went through a mid-life cycle refresh.",R.drawable.hondaodyssey,"ENGINE SPECS  –  3.5L V6 i-VTEC 10AT (280 HP)\n"+
                "\nCylinders: V6 \n\n" +
                "Displacement: 3471 cm3\n\n" +
                "Power:\n" +
                "    205.9 KW @ 6000 RPM\n" +
                "    280 HP @ 6000 RPM\n" +
                "    276 BHP @ 6000 RPM\n\n" +
                "Torque:\n" +
                "    262 lb-ft @ 4700 RPM\n" +
                "    355 Nm @ 4700 RPM\n\n" +
                "Fuel System: Turbocharged Direct Injection\n\n" +
                "Fuel: Gasoline");
        carlist.add(cardata);
        cardata = new CarData("HONDA Civic Hatchback","Exterior styling refinements to the 2020 Honda Civic Hatchback lineup include revised styling of the lower bumper fog light housings, which now features a body-color crossbar.",R.drawable.hondacivichatchback,"ENGINE SPECS  –  1.5L 6MT (174 HP)\n"+
                "\nCylinders: L4 \n\n" +
                "Displacement: 1498 cm3\n\n" +
                "Power:\n" +
                "    128 KW @ 6000 RPM\n" +
                "    174 HP @ 6000 RPM\n" +
                "    172 BHP @ 6000 RPM\n\n" +
                "Torque:\n" +
                "    162 lb-ft @ 1700-5500 RPM\n" +
                "    220 Nm @ 1700-5500 RPM\n\n" +
                "Fuel System: Direct Injection \n\n" +
                "Fuel: Gasoline");
        carlist.add(cardata);
        cardata = new CarData("HONDA CR-V","For over 20 years, the Honda CR-V has been the best-selling crossover in the United States, which is why Honda has decided to gift its fifth generation an extensive mid-cycle facelift for the 2020 model year.",R.drawable.hondacrv,"ENGINE SPECS  –  1.5L Turbo CVT (190 HP)\n"+
                "\nCylinders: L4 \n\n" +
                "Displacement: 1497 cm3\n\n" +
                "Power:\n" +
                "    139.7 KW @ 5600 RPM\n" +
                "    190 HP @ 5600 RPM\n" +
                "    187 BHP @ 5600 RPM\n\n" +
                "Torque:\n" +
                "    179 lb-ft @ 2000-5000 RPM\n" +
                "    243 Nm @ 2000-5000 RPM\n\n" +
                "Fuel System: Turbocharged Direct Injection \n\n" +
                "Fuel: Gasoline");
        carlist.add(cardata);
        cardata = new CarData("HONDA Civic Sedan","Even though it wasn't too much since the tenth generation of the Honda Civic was launched, the Japanese car-maker introduced a facelift for it in 2018.",R.drawable.hondacivicsedan,"ENGINE SPECS  –  1.5L CVT (174 HP)\n"+
                "\nCylinders: L4 \n\n" +
                "Displacement: 1497 cm3\n\n" +
                "Power:\n" +
                "    128 KW @ 6000 RPM\n" +
                "    174 HP @ 6000 RPM\n" +
                "    172 BHP @ 6000 RPM\n\n" +
                "Torque:\n" +
                "    120 lb-ft @ 1700-5500 RPM\n" +
                "    162 Nm @ 1700-5500 RPM\n\n" +
                "Fuel System: Turbocharge Direct Injection \n\n" +
                "Fuel: Gasoline");
        carlist.add(cardata);
        cardata = new CarData("HONDA Civic Type-R","The fifth generation Honda Civic Type-R was introduced in 2017 after being unveiled at the Paris Motor Show in November 2016. The new model uses a design that derives from the standard Civic model.",R.drawable.hondacivicr,"ENGINE SPECS  –  3.5L V6 9AT (573 HP)\n"+
                "\nCylinders: L4 \n\n" +
                "Displacement: 1996 cm3\n\n" +
                "Power:\n" +
                "    235.3 KW @ 6500 RPM\n" +
                "    320 HP @ 6500 RPM\n" +
                "    316 BHP @ 6500 RPM\n\n" +
                "Torque:\n" +
                "    295 lb-ft @ 2500-4500 RPM\n" +
                "    400 Nm @ 2500-4500 RPM\n\n" +
                "Fuel System: Turbocharged Direct Injection \n\n" +
                "Fuel: Gasoline");
        carlist.add(cardata);
        cardata = new CarData("HONDA NSX","After ten years of absence on the market, a new generation Honda NSX supercar debuted at the 2015 North American International Auto Show, bringing a new experience in its segment.",R.drawable.hondansx,"ENGINE SPECS  –  1.3L CVT (98 HP)\n"+
                "\nCylinders: V6 \n\n" +
                "Displacement: 3493 cm3\n\n" +
                "Power:\n" +
                "    372.9 KW @ 6500-7500 RPM\n" +
                "    507 HP @ 6500-7500 RPM\n" +
                "    500 BHP @ 6500-7500 RPM\n\n" +
                "Torque:\n" +
                "    406 lb-ft @ 2000-6000 RPM\n" +
                "    550 Nm @ 2000-6000 RPM\n\n" +
                "Fuel System: Turbocharged Direct Injection \n\n" +
                "Fuel: Hybrid");
        carlist.add(cardata);

        Adapter carAdapter = new Adapter(MainActivity.this, carlist);
        carRecyclerView.setAdapter(carAdapter);
    }
}