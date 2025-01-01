package com.samanthagc.plcodingmasterclass.basiclayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samanthagc.plcodingmasterclass.ui.theme.PLCodingMasterclassTheme

@Composable
fun RowColumnDemo() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            space = 4.dp, alignment = Alignment.CenterHorizontally)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .weight(1f),
            contentAlignment = Alignment.Center
        ) { Text(text = "Box 1", fontSize = 24.sp) }
        Column(
            modifier = Modifier
                .weight(3f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) { Text(text = "Box 2", color = Color.White) }
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ) { Text(text = "Box 3") }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFCC,
    showSystemUi = true
)
@Composable
private fun RowColumnDemoPreview() {
    PLCodingMasterclassTheme {
        RowColumnDemo()
    }
}