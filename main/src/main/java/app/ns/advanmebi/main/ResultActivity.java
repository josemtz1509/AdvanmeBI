package app.ns.advanmebi.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        List<Suggestion> list = new ArrayList<>();
        for(int n =0 ; n< 5 ; n++){
            Suggestion suggestion = new Suggestion();
            suggestion.setName("TEST "+n);
            list.add(suggestion);
        }
        RecyclerView rvSugestions = findViewById(R.id.rvResult);
        rvSugestions.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        SuggestionAdapter adapter = new SuggestionAdapter(list);
        rvSugestions.setAdapter(adapter);


    }
}
