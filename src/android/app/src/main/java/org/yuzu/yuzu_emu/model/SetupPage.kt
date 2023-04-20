// SPDX-FileCopyrightText: 2023 yuzu Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.yuzu.yuzu_emu.model

data class SetupPage(
    val iconId: Int,
    val titleId: Int,
    val descriptionId: Int,
    val buttonIconId: Int,
    val leftAlignedIcon: Boolean,
    val buttonTextId: Int,
    val buttonAction: () -> Unit
)
