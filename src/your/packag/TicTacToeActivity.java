package your.packag;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TicTacToeActivity extends Activity implements OnClickListener {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	String x;
	String o;
	int c;
	int count;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        x="X";
        o="O";
        count=0;
        c=0;
        Toast.makeText(this, "Player 1's Turn", 400).show();
		    
        
  
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(count%2==0)
		{
			switch(v.getId())
			{
			case R.id.button1:
				b1.setText(x);
				//b1.setBackgroundColor(Color.CYAN);
				count++;
			    b1.setEnabled(false);
				check();
				break;
			case R.id.button2:
				b2.setText(x);
				//b2.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b2.setEnabled(false);
				break;
			case R.id.button3:
				b3.setText(x);
				//b3.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b3.setEnabled(false);
				break;
			case R.id.button4:
				b4.setText(x);
				//b4.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b4.setEnabled(false);
				break;
			case R.id.button5:
				b5.setText(x);
				//b5.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b5.setEnabled(false);
				break;
			case R.id.button6:
				b6.setText(x);
				//b6.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b6.setEnabled(false);
				break;
			case R.id.button7:
				b7.setText(x);
				//b7.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b7.setEnabled(false);
				break;
			case R.id.button8:
				b8.setText(x);
				//b8.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b8.setEnabled(false);
				break;
			case R.id.button9:
				b9.setText(x);
				//b9.setBackgroundColor(Color.CYAN);
				check();
				count++;
				b9.setEnabled(false);
				break;
				}
			if(count<9 && c==0)
			{
				Toast.makeText(this, "Player 2's Turn", 50).show();
			    }
		}
			
		
		else if(count%2==1)
		{
			switch(v.getId())
			{
			case R.id.button1:
				b1.setText(o);
				//b1.setBackgroundColor(Color.RED);
				count++;
				b1.setEnabled(false);
				check();
				break;
			case R.id.button2:
				b2.setText(o);
				//b2.setBackgroundColor(Color.RED);
				check();
				count++;
				b2.setEnabled(false);
				break;
			case R.id.button3:
				b3.setText(o);
				//b3.setBackgroundColor(Color.RED);
				check();
				count++;
				b3.setEnabled(false);
				break;
			case R.id.button4:
				b4.setText(o);
				//b4.setBackgroundColor(Color.RED);
				check();
				count++;
				b4.setEnabled(false);
				break;
			case R.id.button5:
				b5.setText(o);
				//b5.setBackgroundColor(Color.RED);
				check();
				count++;
				b5.setEnabled(false);
				break;
			case R.id.button6:
				b6.setText(o);
				//b6.setBackgroundColor(Color.RED);
				check();
				count++;
				b6.setEnabled(false);
				break;
			case R.id.button7:
				b7.setText(o);
				//b7.setBackgroundColor(Color.RED);
				check();
				count++;
				b7.setEnabled(false);
				break;
			case R.id.button8:
				b8.setText(o);
				//b8.setBackgroundColor(Color.RED);
				check();
				count++;
				b8.setEnabled(false);
				break;
			case R.id.button9:
				b9.setText(o);
				//b9.setBackgroundColor(Color.RED);
				check();
				count++;
				b9.setEnabled(false);
				break;
			}
			if(count<9 && c==0)
			{
				Toast.makeText(this, "Player 1's Turn", 50).show();
			    }
	
			
			}
		if(count==9 && c==0)
		{
			Toast.makeText(this, "Match Drawn", 500).show();
			//this.finish();
		}
			}

	private void check() {
		// TODO Auto-generated method stub
		if((b1.getText() == x && b2.getText() == x && b3.getText() == x) || 
				(b4.getText() == x && b5.getText() == x && b6.getText() == x) ||
				(b7.getText() == x && b8.getText() == x && b9.getText() == x) ||
				(b1.getText() == x && b4.getText() == x && b7.getText() == x) ||
				(b2.getText() == x && b5.getText() == x && b8.getText() == x) ||
				(b3.getText() == x && b6.getText() == x && b9.getText() == x) ||
				(b1.getText() == x && b5.getText() == x && b9.getText() == x) ||
				(b3.getText() == x && b5.getText() == x && b7.getText() == x) )
		{
			
			Toast.makeText(this, "Player 1 Wins!!!", 500).show();
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
			c=1;
			//this.finish();
			


		}

			if((b1.getText() == o && b2.getText() == o && b3.getText() == o) || 
				(b4.getText() == o && b5.getText() == o && b6.getText() == o) ||
				(b7.getText() == o && b8.getText() == o && b9.getText() == o) ||
				(b1.getText() == o && b4.getText() == o && b7.getText() == o) ||
				(b2.getText() == o && b5.getText() == o && b8.getText() == o) ||
				(b3.getText() == o && b6.getText() == o && b9.getText() == o) ||
				(b1.getText() == o && b5.getText() == o && b9.getText() == o) ||
				(b3.getText() == o && b5.getText() == o && b7.getText() == o) )
			{
				
				Toast.makeText(this, "Player 2 Wins!!!", 500).show();
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				c=1;
				//this.finish();
			}
		
	}
	}
