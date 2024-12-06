package com.green.greengram.user;

import com.green.greengram.common.model.ResultResponse;
import com.green.greengram.user.model.UserSignInReq;
import com.green.greengram.user.model.UserSignInRes;
import com.green.greengram.user.model.UserSignUpReq;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@Tag(name = "유저", description = "화원가입, 로그인, 마이페이지, 비밀번호 변경, 정보 수정 등 처리")
public class UserController {
    private final UserService service;

    @PostMapping("sign-up")
    @Operation(summary = "회원 가입")
    public ResultResponse<Integer> postSignUp(@RequestPart (required = false)MultipartFile pic, @RequestPart UserSignUpReq p) {
        int result = service.postSignUp(pic, p);
        return ResultResponse.<Integer>builder().resultMsg("가입완료").resultData(result).build();
    }

    @PostMapping("sign-in")
    @Operation(summary = "로그인")
    public ResultResponse<UserSignInRes> postSignIn(@RequestBody UserSignInReq p) {
        UserSignInRes result = service.postSignIn(p);
        return ResultResponse.<UserSignInRes>builder().resultMsg(result.getMessage()).resultData(result).build();
    }
}