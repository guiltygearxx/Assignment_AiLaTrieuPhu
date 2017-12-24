package androidapp.focus.hoangnam.assignment_ailatrieuphu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by HoangNam on 12/16/2017.
 */

public class ReadyGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ready_game);
    }

    public void runGame(View view){
        Intent intent = new Intent(getApplicationContext(), RunGameActivity.class);
        startActivity(intent);
    }
}
