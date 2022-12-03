package com.mabang.actions;

import com.github.nanbiango.views.gui.TimestampUnixView;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

/**
 * 时间戳处理
 */
public class TimestampAction extends AnAction {

    public final TimestampUnixView timestampUnixView = new TimestampUnixView();

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        timestampUnixView.show();
    }
}
