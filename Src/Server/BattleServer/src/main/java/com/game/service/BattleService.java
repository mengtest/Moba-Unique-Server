package com.game.service;

import com.game.network.NetConnectionKCP;
import com.game.network.NetConnectionWebSocket;
import com.game.proto.C2BNet;
import com.game.proto.C2BNet.FrameHandle;
import com.game.proto.C2BNet.GameOverRequest;
import com.game.proto.C2BNet.PercentForward;
import com.game.proto.C2BNet.RepairFrameRequest;
//import com.game.proto.Message.FrameHandle;
//import com.game.proto.Message.GameOverRequest;
//import com.game.proto.Message.PercentForward;
//import com.game.proto.Message.RepairFrameRequest;

public interface BattleService {
	
	 // 帧操作
    void OnFrameHandle(NetConnectionKCP connection, C2BNet.FrameHandlesFromClient frameHandles);
    // 进度转发
    void OnPercentForward(NetConnectionKCP connection, PercentForward percentForward);
    // 游戏结束
    void OnGameOver(NetConnectionKCP connection, GameOverRequest gameOverRequest);
    // 补帧
    void OnRepairFrame(NetConnectionKCP connection, RepairFrameRequest repairFrameRequest);
}
