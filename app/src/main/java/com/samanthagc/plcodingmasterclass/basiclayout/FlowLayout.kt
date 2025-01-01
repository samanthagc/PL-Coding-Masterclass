@file:OptIn(ExperimentalLayoutApi::class)

package com.samanthagc.plcodingmasterclass.basiclayout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowOverflow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samanthagc.plcodingmasterclass.ui.theme.PLCodingMasterclassTheme


@Composable
fun FlowLayoutDemo() {
    FlowRow(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = Arrangement.Center,
        maxItemsInEachRow = 3,
        maxLines = 4,
        overflow = FlowRowOverflow.expandOrCollapseIndicator(
            expandIndicator = {
                IconButton(
                    onClick = { /*show surplus items */}
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Show more items"
                    )
                }
            },
            collapseIndicator = {
                IconButton(
                    onClick = { /*hide surplus items */}
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Show fewer items"
                    )
                }
            }
        )
    ) {
        for (i in 1..30) {
            AssistChip(
                onClick = {},
                label = {
                    Text("Item $i")
                }
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun FlowLayoutDemoPreview() {
    PLCodingMasterclassTheme {
        FlowLayoutDemo()
    }
}