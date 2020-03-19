/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.transaction.message.core.disruptor.translator;

import com.lmax.disruptor.EventTranslatorOneArg;
import io.mykit.transaction.message.common.bean.entity.MykitTransaction;
import io.mykit.transaction.message.core.disruptor.event.MykitTransactionEvent;
import org.springframework.stereotype.Component;

/**
 * @author binghe
 * @version 1.0.0
 * @description MykitTransactionEventPublisher
 */
@Component
public class MykitTransactionEventTranslator implements EventTranslatorOneArg<MykitTransactionEvent, MykitTransaction> {

    private int type;

    public void setType(int type) {
        this.type = type;
    }

    public MykitTransactionEventTranslator(){}

    /**
     * Instantiates a new Myth transaction event translator.
     *
     * @param type the type
     */
    public MykitTransactionEventTranslator(final int type) {
        this.type = type;
    }

    @Override
    public void translateTo(final MykitTransactionEvent mythTransactionEvent, final long l, final MykitTransaction mythTransaction) {
        mythTransactionEvent.setMykitTransaction(mythTransaction);
        mythTransactionEvent.setType(type);
    }
}
