package your.packag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GameMenu extends Activity implements OnClickListener {
	Button b;
	Button c;
	
	
	
	//Intent i; 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        setContentView(R.layout.main2);
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
        c=(Button)findViewById(R.id.button2);
        c.setOnClickListener(this);
    }
    
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		
		if(arg0==c)
		{
			Toast.makeText(this, "Starting Game. Best Of Luck!", 1000).show();
		Intent i= new Intent(this,TicTacToeActivity.class);
		startActivity(i);
		}
		
		
	}
}