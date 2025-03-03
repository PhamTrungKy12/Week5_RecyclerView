package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.model.SongAdapter;
import com.example.recyclerview.model.SongModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSongs;
    private SongAdapter mSongAdapter;
    private List<SongModel> mSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Find RecyclerView
        rvSongs = (RecyclerView) findViewById(R.id.rv_songs);

        // Create song data
        mSongs = new ArrayList<>();
        mSongs.add(new SongModel("60696", "NẾU EM CÒN TỒN TẠI", "Khi anh bắt đầu 1 tình yêu Là lúc anh tự thay", "Trịnh Đình Quang"));
        mSongs.add(new SongModel("60701", "NGỐC", "Có rất nhiều nhưng câu chuyện Em dấu riêng mình em biết", "Khắc Việt"));
        mSongs.add(new SongModel("60650", "HÃY TIN ANH LẦN NỮA", "Dẫu cho ta đã sai khi ở bên nhau Cô yêu thương", "Thiên Dũng"));
        mSongs.add(new SongModel("60698", "CHUÔNG NGÀY VẮNG EM", "Từ khi em bước ra đi cõi lòng anh ngập tràng bao", "Duy Cường"));
        mSongs.add(new SongModel("60656", "KHI NGƯỜI MÌNH YÊU KHÓC", "Nước mắt em đang rơi trên những ngón tay Nước mắt em", "Phạm Mạnh Quỳnh"));
        mSongs.add(new SongModel("60668", "MƠ", "Anh mơ gặp em anh mơ được ôm anh mơ được gần", "Trịnh Thăng Bình"));
        mSongs.add(new SongModel("60752", "TÌNH YÊU CHẤP VÁ", "Muốn đi xa nơi yêu thương mình từng có để không nghe", "Mr. Siro"));
        mSongs.add(new SongModel("60683", "CHỜ NGÀY MƯA TAN", "1 ngày mưa và em khuất xa nơi anh bóng dáng cũ", "Trung Đức"));
        mSongs.add(new SongModel("60663", "CÂU HỎI EM CHƯA TRẢ LỜI", "Khi em nói em 1 lời giải thích thật lòng Đừng lặng im", "Yuki Huy Nam"));
        mSongs.add(new SongModel("60720", "QUA ĐI LẶNG LẼ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhưng khi", "Phan Mạnh Quỳnh"));
        mSongs.add(new SongModel("60856", "QUÊN ANH LÀ ĐIỀU EM KHÔNG THỂ - REMIX", "Cần thêm bao lâu để em quên đi niềm đau Cần thêm", "Thiện Ngôn"));

        mSongAdapter = new SongAdapter(this, mSongs);
        rvSongs.setAdapter(mSongAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvSongs.setLayoutManager(linearLayoutManager);

    }
}