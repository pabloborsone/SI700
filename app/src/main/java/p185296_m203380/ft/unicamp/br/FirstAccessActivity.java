package p185296_m203380.ft.unicamp.br;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstAccessActivity extends AppCompatActivity {

    @BindView(R.id.first_access_edit_text)
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_access);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.first_access_button)
    public void sendUserButtonOnClick() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", userName.getText().toString());
        this.startActivity(intent);
        this.finish();
    }
}
