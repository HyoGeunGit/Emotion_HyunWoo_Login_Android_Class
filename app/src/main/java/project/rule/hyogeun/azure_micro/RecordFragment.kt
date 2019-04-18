package project.rule.hyogeun.azure_micro


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.gun0912.tedpermission.TedPermissionActivity.startActivity

/**
 * Created by Kinetic on 2018-06-02.
 */

class RecordFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_record,
                container,
                false)
        val btn = view.findViewById(R.id.records) as Button
        btn.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View) {
        val intent = Intent(v.context, RecordActivity::class.java)
        startActivity(intent)
    }

}