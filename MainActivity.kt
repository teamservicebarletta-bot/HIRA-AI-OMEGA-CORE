
package com.hiragroup.hiraai

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
        }

        val title = TextView(this).apply {
            text = "HIRA AI ULTRA 360°"
            textSize = 26f
        }

        val status = TextView(this).apply {
            text = "Sistema avviato - Versione di prova"
            textSize = 17f
        }

        val button = Button(this).apply {
            text = "Avvia controllo"
            setOnClickListener {
                status.text = "Interfaccia funzionante. Scansione documenti non ancora disponibile."
            }
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)
        setContentView(layout)
    }
}

