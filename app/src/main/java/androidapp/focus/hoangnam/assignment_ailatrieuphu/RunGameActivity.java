package androidapp.focus.hoangnam.assignment_ailatrieuphu;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HoangNam on 12/16/2017.
 */

public class RunGameActivity extends AppCompatActivity {

    private Dialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.run_game);
    }

    public void askAudience(View view){
        dialog = new Dialog(RunGameActivity.this);
        // khởi tạo dialog
        dialog.setContentView(R.layout.ask_audience_popup);
        // xét layout cho dialog
        dialog.setTitle("Đăng kí");
        // xét tiêu đề cho dialog
        dialog.show();
        // hiển thị dialog
    }

    public void consultant(View view){
        dialog = new Dialog(RunGameActivity.this);
        // khởi tạo dialog
        dialog.setContentView(R.layout.consultant_popup);
        // xét layout cho dialog
        dialog.setTitle("Đăng kí");
        // xét tiêu đề cho dialog
        dialog.show();
        // hiển thị dialog
    }

    public void finish_game(View view){
        dialog = new Dialog(RunGameActivity.this);
        // khởi tạo dialog
        dialog.setContentView(R.layout.finish_game_popup);
        // xét layout cho dialog
        dialog.setTitle("Đăng kí");
        // xét tiêu đề cho dialog
        dialog.show();
        // hiển thị dialog
    }
}
