// Copyright 2022-2023 The Connect Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.connectrpc.conformance.client.java

import com.connectrpc.CallOptions
import com.connectrpc.conformance.client.adapt.BidiStreamClient
import com.connectrpc.conformance.v1.BidiStreamRequest
import com.connectrpc.conformance.v1.BidiStreamResponse
import com.connectrpc.conformance.v1.ConformanceServiceClient

class JavaBidiStreamClient(
    private val client: ConformanceServiceClient,
) : BidiStreamClient<BidiStreamRequest, BidiStreamResponse>(
    BidiStreamRequest.getDefaultInstance(),
    BidiStreamResponse.getDefaultInstance(),
) {
    override suspend fun execute(options: CallOptions): BidiStream<BidiStreamRequest, BidiStreamResponse> {
        return BidiStream.new(client.bidiStream(options))
    }
}
