package com.yahyaubaid.kopibenihid;

import java.util.ArrayList;

public class KopiData {
    private static String[] kopiNames = {
            "Benih Cinta",
            "Benih Rindu",
            "Kopi Beer",
            "Cappuccino",
            "Caffe Late",
            "Long Black",
            "Americano",
            "V60",
            "Vietnam Drip",
            "Kopi Tiramisu",
            "Kopi Vanilla",
            "Kopi Caramel",
            "Kopi Hazelnut",
            "Kopi Pandan",
            "Mochaccino",
            "Matcha Latte"
    };

    private static String[] kopiDetails = {
            "Benih cinta, perpaduan ciamik antara kopi 1 Shot espreso terbaik kami, susu, dan si manis kurma. Untuk rasa ini kami tonjolkan lebih ke manis dengan balutan tipis si kopi, membuat rasanya lebih milky, ini sangat cocok untuk kalian yg tidak terlalu suka pahitnya kopi.",
            "Benih rindu, perpaduan 2 shot kopi espreso terbaik kami. Susu dan kurma yg berkualitas, filosofi dari kata rindu adalah beratnya rasa kopi yg kami tonjolkan disini tanpa menghilangkan rasa kurma yg ada didalamnya, buat pecinta kopi ini sangat rekommended sih.",
            "Kopi beer, kopi susu soda kekinian yg merupakan varian terbaru dari kami untuk para pecinta minuman bersoda wajib banget nyobain kopi yg satu ini.",
            "Kamu pasti selalu menemukan cappuccino dalam buku menu tiap kali pergi ke kedai kopi, atau bahkan kafe-kafe biasa. Cappuccino adalah olahan espresso yang paling banyak digemari, terutama bagi penikmat kopi dengan rasa lebih mild",
            "Kalau kamu gak terlalu menikmati kopi yang cenderung pahit, kamu bisa pesan caffe late sebagai alternatif. Rasio steamed milk dalam minuman ini lebih besar dari espresso, sehingga ada sentuhan milky dan gurih.",
            "Long Black. Jenis minuman yang termasuk ke dalam “keluarga kopi hitam” ini terdiri dari air panas dan espresso. Minuman ini disajikan dengan menyiapkan air panas terlebih dahulu lalu setelah itu dituangkan espresso ke dalamnya.",
            "Americano adalah minuman kopi espresso dengan tambahan air panas.Konon, penyebutan americano adalah sebagai lelucon dan ejekan terhadap orang-orang Amerika yang suka espresso-nya dibuat lebih encer.",
            "V60 adalah methode pour over dimana kopi lebih aromatik, bersih, menonjolkan karakter karakter tertentu yang belum tentu bisa di dapatkan dengan cara penyeduhan lain.",
            "Kopi vietnam drip adalah kopi yang diseduh dengan dripper vietnam dan disajikan bersama susu/krimer kental manis. Penyajian minuman ini lahir karena menyesuaikan karakter biji robusta dari hasil perkebunan di Vietnam. Di negara asalnya, minuman ini lebih banyak disajikan dingin.",
            "Kopi Tiramisu. Perpaduan 1 shot espresso, saus tiramisu, dan susu yang creamy, membuat rasa dari kopi ini sangat cocok untuk yang tidak terlalu suka dengan pahitnya kopi.",
            "Kopi Vanilla. Perpaduan 1 shot espresso, saus vanilla, dan susu yang creamy, membuat rasa dari kopi ini sangat cocok untuk yang tidak terlalu suka dengan pahitnya kopi.",
            "Kopi Caramel. Perpaduan 1 shot espresso, saus caramel, dan susu yang creamy, membuat rasa dari kopi ini sangat cocok untuk yang tidak terlalu suka dengan pahitnya kopi.",
            "Kopi Hazelnut. Perpaduan 1 shot espresso, saus hazelnut, dan susu yang creamy, membuat rasa dari kopi ini sangat cocok untuk yang tidak terlalu suka dengan pahitnya kopi.",
            "Kopi Pandan. Perpaduan 2 shot espresso, susu yang creamy, dan rasa pandan yang khas membuat aroma kopi ini sangat sedap. Untuk rasanya pun sudah pasti sangat menarik dan enak untuk dicicipi.",
            "Mochaccino merupakan minuman olahan kopi dengan cokelat yang begitu eksotis rasanya. Mochaccino berbahan dasar dari espresso, cokelat, dan susu murni. Minuman ini begitu populer saat ini, menjadi salah satu minuman olahan kopi yang banyak digemari.",
            "Matcha latte, perpaduan antara kopi,susu yg creamy dan rasa khas dari si macha, para pecinta macha wajib banget nyobain varian yg satu ini karna rasanya yg sangat enak dan menarik."
    };

    private static String[] kopiHarga = {
            "18K",
            "18K",
            "18K",
            "18K",
            "18K",
            "15K",
            "15K",
            "15K",
            "15K",
            "18K",
            "18K",
            "18K",
            "18K",
            "18K",
            "18K",
            "18K"
    };

    private static int[] kopiImages = {
            R.drawable.cinta1,
            R.drawable.rindu1,
            R.drawable.benih,
            R.drawable.cappuccino,
            R.drawable.cafelate,
            R.drawable.longblack,
            R.drawable.americano,
            R.drawable.v60,
            R.drawable.vietnam,
            R.drawable.tiramisu,
            R.drawable.vanila,
            R.drawable.caramel,
            R.drawable.hazelnut,
            R.drawable.pandan,
            R.drawable.kopicoklat,
            R.drawable.matcha
    };

    static ArrayList<Kopi> getListData() {
        ArrayList<Kopi> list = new ArrayList<>();
        for (int position = 0; position < kopiNames.length; position++) {
            Kopi kopi = new Kopi();
            kopi.setName(kopiNames[position]);
            kopi.setDetail(kopiDetails[position]);
            kopi.setPhoto(kopiImages[position]);
            kopi.setHarga(kopiHarga[position]);
            list.add(kopi);
        }
        return list;
    }
}
