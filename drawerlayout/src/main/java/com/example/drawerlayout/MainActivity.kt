package com.example.drawerlayout


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Android  抽屉的使用
 */
class MainActivity : AppCompatActivity(),DrawerLayout.DrawerListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initView()
    }

    private fun initView() {

        /**
         *  ToolBar 和 DrawerLayout 设置联动
         */

//        val drawerToggle = ActionBarDrawerToggle(this@MainActivity, drawerlayout, toolbar,R.string.open, R.string.close)
//
//        //同步状态
//        drawerToggle.syncState()
//
//        drawerlayout.addDrawerListener(drawerToggle)

        drawerlayout.addDrawerListener(this)
    }

    /**
     * 抽屉：滚动状态改变
     */
    override fun onDrawerStateChanged(newState: Int) {

    }

    /**
     * 抽屉：拖动状态
     */
    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {

    }

    /**
     * 抽屉：关闭状态
     */
    override fun onDrawerClosed(drawerView: View) {

    }

    /**
     * 抽屉：打开状态
     */
    override fun onDrawerOpened(drawerView: View) {

    }
}
